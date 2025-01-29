//gets input
const userInput = prompt("Please enter your num: ");
//splits each character and puts it in a list
let array = userInput.split("")
//place holder for final calculation
let final = 0

function Main(array, final){
    
    //gets the length of the array and if its less then i then puts the number into nums and adds them up. 
    for (let i = 0; i < array.length; i++){
        let nums = parseInt(array[i])
        final += nums
    }
    console.log("the sum is: " + final)}

Main(array, final)
