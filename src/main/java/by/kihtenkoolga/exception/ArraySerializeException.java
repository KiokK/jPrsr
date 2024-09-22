package by.kihtenkoolga.exception;

public class ArraySerializeException extends RuntimeException{

    public ArraySerializeException(String message) {
        super(message);
    }

    public static ArraySerializeException bySerializeIndex(int serializeIndexException) {
        return new ArraySerializeException(
                String.format("Array serialize exception at index: %d", serializeIndexException)
        );
    }
}
