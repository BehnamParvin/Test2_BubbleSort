package com.test2.bubbleSort;

import java.util.Arrays;
import java.util.List;

public class Test2_BubbleSort {

    Person person = new Person("Benni", "Parvin", 1981);
    Person person1 = new Person("Jan", "scott", 1990);
    Person person2 = new Person("Maxi", "Berg", 2000);
    Person person3 = new Person("Niki", "Alen", 1995);

    List<Person> personList = Arrays.asList(person2,person1,person3,person);

    private List<Person> sortByNameAscending(List<Person> persons) {
        int i, j;
        Person temp;

        for (i = 0; i < (persons.size() - 1); i++ )
        {
            for ( j = i + 1;  j < persons.size();  j++ )
            {
                if ( persons.get(i).name.compareToIgnoreCase( persons.get(j).name ) > 0 )
                {
                    temp = persons.get(i);
                    persons.set(i, persons.get(j)) ;
                    persons.set(j, temp);
                }
            }
        }
        return persons;
    }

    private List<Person> sortByNameDescending(List<Person> persons) {
        int i, j;
        Person temp;

        for (i = 0; i < (persons.size() - 1); i++ )
        {
            for ( j = i + 1;  j < persons.size();  j++ )
            {
                if ( persons.get(i).name.compareToIgnoreCase( persons.get(j).name ) < 0 )
                {
                    temp = persons.get(i);
                    persons.set(i, persons.get(j)) ;
                    persons.set(j, temp);
                }
            }
        }
        return persons;
    }

    private List<Person> sortByYearOfBirthDescending(List<Person> persons) {
        int i, j;
        Person temp;

        for (i = 0; i < (persons.size() - 1); i++ )
        {
            for ( j = i + 1;  j < persons.size();  j++ )
            {
                if ( persons.get(i).year_Of_Birth > persons.get(j).year_Of_Birth )
                {
                    temp = persons.get(i);
                    persons.set(i, persons.get(j)) ;
                    persons.set(j, temp);
                }
            }
        }
        return persons;
    }
}
