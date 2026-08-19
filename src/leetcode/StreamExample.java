import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    private int id;
    private int value;
    private String type;

    public Transaction(int id, int value, String type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1, 100, "GROCERY"),
            new Transaction(3, 80, "GROCERY"),
            new Transaction(6, 120, "GROCERY"),
            new Transaction(7, 40, "ELECTRONICS"),
            new Transaction(10, 50, "GROCERY")
        );

        // Stream pipeline based on your diagram
        List<Integer> transactionIds = transactions.stream()
                .filter(t -> t.getType().equals("GROCERY"))       // keep only groceries
                .sorted(Comparator.comparing(Transaction::getValue).reversed()) // sort by value desc
                .map(Transaction::getId)                         // map to id
                .collect(Collectors.toList());                   // collect as list

        System.out.println(transactionIds); 
    }
}
