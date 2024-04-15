import os
import pandas as pd
import json

current_dir = os.path.dirname(__file__)
csv_file = os.path.join(current_dir, 'QueryResults_python_442.csv')

df = pd.read_csv(csv_file)

for index, row in df.iterrows():
    if 'Title' in row and pd.notnull(row['Title']) and 'python' in row['Title'].lower():
        print(row['Title'])
        with open('python_issues.json', 'a') as f:
            f.write(json.dumps(row.to_dict()) + '\n')