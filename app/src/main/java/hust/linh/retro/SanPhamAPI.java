package hust.linh.retro;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by duy on 2/14/2017.
 */

public interface SanPhamAPI {
    @GET("/api/public/index.php/getAll")
    public void getSanPham(Callback<List<SanPham>> response);
}
