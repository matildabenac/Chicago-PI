import csv
import datetime
import pymysql.cursors

connection = pymysql.connect(host='localhost',
                             user='root',
                             password='',
                             db='Chicago-PI',
                             charset='utf8mb4',
                             cursorclass=pymysql.cursors.DictCursor)


with open('Chicago_Crimes_2012_to_2017.csv', mode='r') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    line_count = 0
    for row in csv_reader:
        if line_count == 0:
            # print(f'Column names are {", ".join(row)}')
            line_count += 1
        date = datetime.datetime.strptime(row["Date"], '%m/%d/%Y %I:%M:%S %p')
        print(f'\t{row["ID"]}       {date}      {row["Block"]}      {row["Primary Type"]}       {row["Description"]}        {row["Location Description"]}       {row["Arrest"]}     {row["Domestic"]}')

        arrest = 0
        domestic = 0

        if row["Arrest"] == "True":
            arrest = 1

        if row["Domestic"] == "True":
            domestic = 1

        with connection.cursor() as cursor:
            # Create a new record
            sql = "INSERT INTO `Crime` (`ID_crime`, `Date`, `Block`, `Primary_type`, `Description`, `Location_description`, `Arrest`, `Domestic`) VALUES (%s, %s, %s, %s, %s, %s, %s, %s)"
            cursor.execute(sql, (row["ID"], date, row["Block"], row["Primary Type"], row["Description"], row["Location Description"], arrest, domestic))

            # connection is not autocommit by default. So you must commit to save
            # your changes.
            connection.commit()

        line_count += 1
    print(f'Processed {line_count} lines.')

connection.close()
