package com.mickw.mickw.query;

import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by mick on 25/07/2014.
 */
public class JsonRequestTask extends AsyncTask<String, Void, String> {


    private JsonResponseProcessor responseProcessor;

    public JsonRequestTask(JsonResponseProcessor responseProcessor) {
        this.responseProcessor = responseProcessor;
    }

    @Override
    protected String doInBackground(String... params) {
        HttpClient httpClient = new DefaultHttpClient();
        String response = null;
        try {
            HttpResponse httpResponse = httpClient.execute(new HttpGet(params[0]));
            response = getResponseContent(httpResponse.getEntity().getContent());
            return response;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return response;
    }


    private String getResponseContent(InputStream stream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        StringBuffer sb = new StringBuffer();
        String line = reader.readLine();
        sb.append(line);
        return sb.toString();
    }

    @Override
    protected void onPostExecute(String result) {
        responseProcessor.process(result);
    }

}
