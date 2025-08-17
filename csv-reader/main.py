# This is a sample Python script.
import pandas as pd
import uuid
import requests

from person import Person

def csv_reader():
    dataframe = pd.read_csv('managers_csv.csv')
    people = []
    for index, row in dataframe.iterrows():
        splitted_row = row[index].split(";")
        person = Person(
            name=splitted_row[0],
            capacity=splitted_row[1],
            central_id=uuid.UUID(splitted_row[2]),
            tenant_id=uuid.UUID(splitted_row[3]),
            group_id=uuid.UUID(splitted_row[4]),
            funcional=splitted_row[5]
        )
        # print(person)
        people.append(person)

    return people

def post_customers(people):
    url = "http://localhost:8080/manager"
    for person in people:
        payload = {
            "name": person.name,
            "centralId": str(person.central_id),
            "tenantId": str(person.tenant_id),
            "groupId": str(person.group_id),
            "capacity": person.capacity,
            "funcional": person.funcional
        }
        print(f'making the POST for the person {person}')
        try:
            response = requests.post(url, json=payload)
            print(f'response json {response.json()} with status code {response.status_code}')
        except Exception as e:
            print(e)

    # Press the green button in the gutter to run the script.
if __name__ == '__main__':
    people = csv_reader()
    post_customers(people)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
