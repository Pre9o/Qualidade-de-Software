import os
import pandas as pd
import json

current_dir = os.path.dirname(__file__)
csv_file_python = os.path.join(current_dir, 'QueryResults_python_442.csv')

df = pd.read_csv(csv_file_python)

for index, row in df.iterrows():
    if 'Title' in row and pd.notnull(row['Title']) and 'python' in row['Title'].lower():
        with open('python_questions.json', 'a') as f:
            f.write(json.dumps(row.to_dict()) + '\n')
            
            
csv_file_java = os.path.join(current_dir, 'QueryResults_java_182.csv')

df = pd.read_csv(csv_file_java)

for index, row in df.iterrows():
    if 'Title' in row and pd.notnull(row['Title']) and 'java' in row['Title'].lower():
        with open('java_questions.json', 'a') as f:
            f.write(json.dumps(row.to_dict()) + '\n')