import csv


with open('Chicago_Crimes_2012_to_2017.csv', mode='r') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    line_count = 0
    for row in csv_reader:
        if line_count == 0:
            print(f'Column names are {", ".join(row)}')
            line_count += 1
        print(f'\t{row["ID"]}		{row["Date"]}		{row["Block"]}		{row["Description"]}')
        line_count += 1
    print(f'Processed {line_count} lines.')