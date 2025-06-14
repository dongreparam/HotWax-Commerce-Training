function greet(name){
    if (name === undefined) {
        console.log('Hello')
    } else {
        console.log('This is ' + name)
    }
}

greet(undefined);
greet();
greet('Param');