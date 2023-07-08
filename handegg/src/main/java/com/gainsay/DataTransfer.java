package com.gainsay;

import java.util.List;

public interface DataTransfer {
    List<String> retrieveDataFromFile(String filePath);
    void saveDataToFile(List<Object> objectList);
}
