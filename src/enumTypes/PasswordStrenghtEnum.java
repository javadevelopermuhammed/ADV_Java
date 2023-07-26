package enumTypes;

public enum PasswordStrenghtEnum {

    TOOLOW(0),
    LOW(10),
    MEDIUM(20),
    HIGH(30);

    private final int level;

    //getter

    public int getLevel() {
        return level;
    }

    //constructor-private
    PasswordStrenghtEnum(int level) {
        this.level = level;
    }
}
