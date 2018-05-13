package com.example.cloudme.activity.dailyInfoActivity;

/**
 * Created by Illya Havrulyk on 5/12/2018.
 */

public class DailyInfoPresenter implements IDailyInfoPresenter{
    private IDailyInfoView view;

    public DailyInfoPresenter(IDailyInfoView view) {
        this.view = view;
    }
}
