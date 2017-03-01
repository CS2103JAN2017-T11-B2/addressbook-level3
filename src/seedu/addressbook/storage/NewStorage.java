package seedu.addressbook.storage;

import seedu.addressbook.storage.StorageFile;

public class NewStorage {
    public static StorageFile getNewStorage() throws StorageFile.InvalidStorageException {
        return new StorageFile();
    }
}
