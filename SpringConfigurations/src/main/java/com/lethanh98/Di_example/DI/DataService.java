package com.lethanh98.Di_example.DI;

public class DataService {
    private ShowData showData;

    public DataService(ShowData showData) {
        this.showData = showData;
    }

    void showDataService() {
        this.showData.showData();
    }
}
