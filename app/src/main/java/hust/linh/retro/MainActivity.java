package hust.linh.retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RestAdapter ra=new RestAdapter.Builder().setEndpoint("http://linhbui.net/").build();
        SanPhamAPI sanPhamAPI=ra.create(SanPhamAPI.class);
        sanPhamAPI.getSanPham(new Callback<List<SanPham>>() {
            @Override
            public void success(List<SanPham> sanPhams, Response response) {
                System.out.println(sanPhams.get(0).getTenSP()+"");
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
