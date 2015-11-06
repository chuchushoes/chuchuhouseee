package com.example.test.homework_1.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chuchushoes on 2015/11/06.
 */
public class MyDataResult {
    private Result result;

    public Result getResult() {
        return result;
    }

    // Inner Classes
    public static class Result {
        private String offset;

        @SerializedName("limit")
        private String limitation;

        private String count;

        private String sort;

        private List<ResultItem> results;

        public List<ResultItem> getResults() {
            return results;
        }

    }

    public static class ResultItem {
        private String _id;
		private String 提問;
		private String 答覆;
        private String 相關連結網址;
        private String 相關連結說明;


        public String get_id() {
			return _id;
		}


		public String getQuestion() {
			return 提問;
		}


		public String getAsk() {
			return 答覆;
		}

        public String getURL() {
            return 相關連結網址;
        }

        public String getLinkQ() {
            return 相關連結說明;
        }

    }
}
