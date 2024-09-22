package by.kihtenkoolga.exception;

public class JsonDeserializeException extends RuntimeException {

    public JsonDeserializeException(String message) {
        super(message);
    }

    public static JsonDeserializeException byIncorrectPosition(int incorrectPosition) {
        return new JsonDeserializeException(
                String.format("Incorrect start parse position ind : %s", incorrectPosition)
        );
    }
}
