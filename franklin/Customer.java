package franklin;

public record Customer(String name, String customerId) {
    public Customer {
        if (name == null || customerId == null) {
            throw new IllegalArgumentException("Invalid customer details");
        }
    }
}

