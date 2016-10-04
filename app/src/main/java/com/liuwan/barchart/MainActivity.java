package com.liuwan.barchart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.liuwan.barchart.widget.CustomBarChart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuwan on 2016/10/4.
 */
public class MainActivity extends Activity {

    private LinearLayout customBarChart1, customBarChart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customBarChart1 = (LinearLayout) findViewById(R.id.customBarChart1);
        initBarChart1();

        customBarChart2 = (LinearLayout) findViewById(R.id.customBarChart2);
        initBarChart2();
    }

    /**
     * 初始化柱状图1数据
     */
    private void initBarChart1() {
        String[] xLabel = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
                "28", "29", "30", "31"};
        String[] yLabel = {"0", "100", "200", "300", "400", "500", "600", "700", "800", "900"};
        int[] data1 = {300, 500, 550, 500, 300, 700, 800, 750, 550, 600, 400, 300, 400, 600, 500,
                700, 300, 500, 550, 500, 300, 700, 800, 750, 550, 600, 400, 300, 400, 600, 500};
        List<int[]> data = new ArrayList<>();
        data.add(data1);
        List<Integer> color = new ArrayList<>();
        color.add(R.color.color12);
        color.add(R.color.color13);
        color.add(R.color.color16);
        customBarChart1.addView(new CustomBarChart(this, xLabel, yLabel, data, color));
    }

    /**
     * 初始化柱状图2数据
     */
    private void initBarChart2() {
        String[] xLabel = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] yLabel = {"0", "100", "200", "300", "400", "500", "600", "700", "800", "900"};
        int[] data1 = {300, 500, 550, 500, 300, 700, 800, 750, 550, 600, 400, 300};
        int[] data2 = {400, 600, 500, 700, 300, 500, 550, 500, 300, 700, 800, 750};
        List<int[]> data = new ArrayList<>();
        data.add(data1);
        data.add(data2);
        List<Integer> color = new ArrayList<>();
        color.add(R.color.color14);
        color.add(R.color.color15);
        color.add(R.color.color11);
        customBarChart2.addView(new CustomBarChart(this, xLabel, yLabel, data, color));
    }

}