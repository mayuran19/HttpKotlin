import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.Method
import org.amlabs.keystore.IntracKeyStore
import org.jsoup.Jsoup
import org.jsoup.nodes.Element

class HttpGet {
    fun httpGet(url: String){
        val manager = FuelManager()
        val keyStore = IntracKeyStore.keyStore
        manager.keystore = keyStore
        val(req, res, result) = manager.request(Method.GET, url).response()
        //val (request, response, result) = "https://httpbin.org/get".httpGet().responseString() // result is Result<String, FuelError>
        //Jsoup.parse(String(result.get())).select("")
        println(String(result.get()))
    }
}