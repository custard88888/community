package com.sxl.community.provider;

import com.sxl.community.dto.AccessTokenDTO;
import org.springframework.stereotype.Component;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/3/12 15:05<br/>
 *
 * @author Administrator<br />
 * @since JDK 1.8
 */

@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        public static final MediaType JSON
                = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();

        String post(String url, String json) throws IOException {
            RequestBody body = RequestBody.create(JSON, json);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        }
    }
}
