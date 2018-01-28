var numberOfOranges = 1
var numberOfApples = 5

if numberOfApples > numberOfOranges {
    print("You have more apples than oranges!")
}

var money = 20 /* you have 20$*/
var burgerPrice = 10 /* you ate a good burger*/

/* if you have enough money pay for the burger*/
if money >=  burgerPrice {
    print("pay burger")
    money -= burgerPrice
} else {
/* otherwise you will need to go wash dishes to pay for your meal
 hopefully this will not be the case*/
    print("wash dishes")
}

