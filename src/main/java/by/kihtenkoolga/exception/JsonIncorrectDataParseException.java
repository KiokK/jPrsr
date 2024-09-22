package by.kihtenkoolga.exception;

public class JsonIncorrectDataParseException extends RuntimeException {

    public JsonIncorrectDataParseException(String message) {
        super(message);
    }

    public static JsonIncorrectDataParseException byIncorrectDataType(Class<?> dataType) {
        return new JsonIncorrectDataParseException(
                String.format("Incorrect data for type : %s", dataType.getName())
        );
    }

    public static JsonIncorrectDataParseException byNull() {
        return new JsonIncorrectDataParseException("Incorrect data with null value");
    }

}
