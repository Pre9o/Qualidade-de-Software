with open('python_issues.json', 'a') as f:
            f.write(json.dumps(row.to_dict()) + '\n')