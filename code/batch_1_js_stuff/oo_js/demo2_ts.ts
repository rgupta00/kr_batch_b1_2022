// function greeting(persoName: string): void{
//     console.log(persoName)
// }

// greeting(55)
// function greeting(persoName: any): void{
//     console.log(persoName)
// }


//  greeting(55)

// function greeting(persoName: string): string{
//     return "welcome to " +persoName;
// }


//  greeting('champ')


// function add(a: number, b: number): number{
//     return a+b;
// }




// let a=  (a: number, b: number): number=> a+b;

// console.log(a(2,3))

//interface

// interface Friend{
//     name: string, add: string, salary?: number
// }

// function printFriendsDetails(friends: Friend[]){
//     for(let friend of friends){
//         console.log(`name is ${friend.name} and add is ${friend.add} and salary is ${friend.salary}`)
//     }
// }

// let friendsArr=[
//     {"name":"raj","add":"del","salary":8966},
//     {"name":"abc","add":"del"}
// ];
// printFriendsDetails(friendsArr)

// how to declare datatypes

// let isDone:boolean;

// isDone=true

// enum Gender{F,M}

// let data: Array<number>=[3,6,6];
// for(let d of data){
//     console.log(d)
// }


//classes and inheriance with ts

class Emp{
    constructor(private name: string, private salary: number){
    }

    public print(): void{
        console.log(`the details are ${this.name} and ${this.salary}`)
    }
}

class Programmer extends Emp{
    constructor( name: string,  salary: number, private language: string){
        super(name,salary)
        this.language=language;
    }


    public print(): void{
        super.print();
        console.log(` ${this.language}`)
    }
}

let p=new Programmer('raja',56777,'java')
p.print();




//class
















