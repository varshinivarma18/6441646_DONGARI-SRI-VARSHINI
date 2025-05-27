public class q38_DecompileExample {
    private String message;

    public q38_DecompileExample(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message.toUpperCase();
    }

    public static void main(String[] args) {
        q38_DecompileExample example = new q38_DecompileExample("hello world");
        System.out.println(example.getMessage());
    }
}
