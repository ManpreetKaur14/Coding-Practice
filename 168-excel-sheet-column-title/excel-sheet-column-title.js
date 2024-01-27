var convertToTitle = function (columnNumber) {
let char = "";

while (columnNumber > 0) {
    let remainder = (columnNumber - 1) % 26;
    char = String.fromCharCode(remainder + 65) + char;  //Add character to the front
    columnNumber = Math.floor((columnNumber - 1) / 26); // update the columnNumber
}

return char;
}