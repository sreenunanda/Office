
package newproject.test;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpsBasicAuthentication {
	
	
	public static void getWithBasicAuth(String host, String url, String username, String password)
	        throws ClientProtocolException, IOException {

	    HttpHost target = new HttpHost(host, 80, "http");
	    CredentialsProvider credsProvider = new BasicCredentialsProvider();
	    credsProvider.setCredentials(new AuthScope(target.getHostName(), target.getPort()),
	            new UsernamePasswordCredentials(username, password));
	    CloseableHttpClient httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();
	    try {
	        AuthCache authCache = new BasicAuthCache();
	        BasicScheme basicAuth = new BasicScheme();
	        authCache.put(target, basicAuth);
	        HttpClientContext localContext = HttpClientContext.create();
	        localContext.setAuthCache(authCache);

	        HttpGet httpget = new HttpGet(url);

	        System.out.println("Executing request " + httpget.getRequestLine() + " to target " + target);
	        for (int i = 0; i < 3; i++) {
	            CloseableHttpResponse response = httpclient.execute(target, httpget, localContext);
	            try {
	                System.out.println("----------------------------------------");
	                System.out.println(response.getStatusLine());
	                System.out.println(EntityUtils.toString(response.getEntity()));
	            } finally {
	                response.close();
	            }
	        }
	    } finally {
	        httpclient.close();
	    }
	}
}
