const express = require('express');
const app = express();
const port = 3000;

// Middleware, um JSON zu verarbeiten
app.use(express.json());

// Startdaten: 10 Personen
let persons = [
  { id: 1, firstname: 'John', lastname: 'Doe' },
  { id: 2, firstname: 'Jane', lastname: 'Smith' },
  { id: 3, firstname: 'Alice', lastname: 'Johnson' },
  { id: 4, firstname: 'Bob', lastname: 'Brown' },
  { id: 5, firstname: 'Charlie', lastname: 'Davis' },
  { id: 6, firstname: 'Emily', lastname: 'Wilson' },
  { id: 7, firstname: 'Frank', lastname: 'Miller' },
  { id: 8, firstname: 'Grace', lastname: 'Taylor' },
  { id: 9, firstname: 'Hank', lastname: 'Anderson' },
  { id: 10, firstname: 'Ivy', lastname: 'Thomas' },
];


app.get('/persons', (req, res) => res.json(persons));

app.post('/persons', (req, res) => {
  const person = req.body;
  person.id = persons.length + 1;
  persons.push(person);
  res.json(person);
});

app.put('/persons/:id', (req, res) => {
  const id = +req.params.id;
  const person = persons.find(p => p.id === id);
  if (person) {
    Object.assign(person, req.body);
    res.json(person);
  } else {
    res.status(404).send('Nost found');
  }
});

app.delete('/persons/:id', (req, res) => {
  const id = +req.params.id;
  persons = persons.filter(p => p.id !== id);
  res.send('Deleted');
});


app.listen(port, () => console.log(`Server läuft auf http://localhost:${port}`));