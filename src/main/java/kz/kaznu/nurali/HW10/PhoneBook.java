package kz.kaznu.nurali.HW10;
import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber){
        phoneBook.putIfAbsent(name, new HashSet<>());
        phoneBook.get(name).add(phoneNumber);
    }

    public Set<String> find(String name){
        return phoneBook.getOrDefault(name, Collections.emptySet());
    }

    public boolean containsPhoneNumber(String phoneNumber){
        for (Set<String> numbers : phoneBook.values()){
            if (numbers.contains(phoneNumber)){
                return true;
            }
        }
        return false;
    }

}
