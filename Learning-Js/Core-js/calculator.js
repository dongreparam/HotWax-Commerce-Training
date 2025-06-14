function calculator(a,b,operation){
    if (operation === 'add') {
        return a + b;
    } else if(operation === 'subtract'){
        return a - b;
    } else if(operation === 'multiply'){
        return a * b;
    } else if(operation === 'divide'){
        return a/b;
    } else {
        return 'Unknown'
    }
}

console.log(calculator(5,8,"subtract"));
