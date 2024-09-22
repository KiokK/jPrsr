package by.kihtenkoolga.exception;

public class JsonParseFieldNameException extends RuntimeException{

    public JsonParseFieldNameException(String message) {
        super(message);
    }

    public static JsonParseFieldNameException byFieldName(String fieldName) {
        return new JsonParseFieldNameException(
                String.format("Error deserialization classes field with name: %s", fieldName)
        );
    }
}
