package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       /*
       Задача1
Есть класс homework.Address с полями
String street
int houseNumber

и класс homework.Person с полями
String name
int age
homework.Address address

Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех, кто старше 17 лет.
List\<homework.Address>getAddresses(List\<homework.Person> input)

Задача2
Используя стримы написать метод, принимающий строку, состоящую из слов, разделенных пробелом и букву и возвращающий количество слов, начинающихся с этой буквы.
long countWords (String input, String letter)

пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 , т.к. слово, начинающееся на a встречается 4 раза
        */
        Address address1 = new Address("LLLL",14);
        Address address2 = new Address("AAAa",27);
        Address address3 = new Address("Nnnn",91);
        Address address4 = new Address("GPSA",1);

        Person person1 = new Person("Jack",18,address1);
        Person person2 = new Person("Mary",14,address2);
        Person person3 = new Person("Kate",19,address3);
        Person person4 = new Person("John",11,address4);

        List<Person> list = List.of(person1,person2,person3,person4);
        System.out.println(getAddress(list).toString()); //OUTPUT: [LLLL 14, Nnnn 91]


        String str = "aaa ffff aa bbbb a bb aaa gggggggggggggg";
        System.out.println(countWords(str,"a")); // OUTPUT 4
    }
    public static List<Address> getAddress(List<Person> list){
          return list.stream()
                  .filter(n -> n.age>17)
                  .map(s-> s.address)
                  .collect(Collectors.toList());
    }
    public static long countWords(String input, String letter){
     return   Arrays.stream(input.split(" "))
                .map(s -> s.substring(0,1))
                .filter(s -> s.equals(letter))
                .count();
    }
}