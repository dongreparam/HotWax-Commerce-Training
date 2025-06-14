function typeCheck(info){
    if(typeof info === "number"){
        console.log("You gave me a Number" , info)
    }
    else if (typeof info === "string"){
        console.log("you gave me a String", info)
    }
}

let info = 'Param'

typeCheck(info)
typeCheck(9)

