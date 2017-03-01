package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Storage {
    
    /**
     * Signals that the storage is invalid in some way
     */
    public static class InvalidStorageException extends IllegalValueException {
        public InvalidStorageException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }

    /**
     * Loads the stored addressbook data
     * @return AddressBook object
     * @throws StorageOperationException
     */
    abstract public AddressBook load() throws StorageOperationException;
    
    /**
     * Gets Storage Path
     * @return String path of storage
     */
    abstract public String getPath();
    
    /**
     * Saves the addressbook to the storage
     * @param addressBook
     * @throws StorageOperationException
     */
    abstract public void save(AddressBook addressBook) throws StorageOperationException;
}
