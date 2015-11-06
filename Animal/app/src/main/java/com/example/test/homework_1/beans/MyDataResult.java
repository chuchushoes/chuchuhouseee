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
		private String className;
		private String Question;
		private String Ask;

        public String get_id() {
			return _id;
		}


		public String getclassName() {
			return className;
		}


		public String getQuestion() {
			return Question;
		}


		public String getAsk() {
			return Ask;
		}

    }
}
