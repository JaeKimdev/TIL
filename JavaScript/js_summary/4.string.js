let string = "Hello World";
string = `Hello World`;
console.log(string);
string = '"Hello World"';
console.log(string);

// Special characters:
string = "Hello\nWorld";
console.log(string);
string = "Hello\tWorld";
console.log(string);

// Template Literal
let id = "Jae";
let greeting = `Hello, ` + id + `!` + `\nHave a nice day 😄`;
console.log(greeting);

greeting = `Hello, ${id}!
Have a nice day 😄`;
console.log(greeting);
