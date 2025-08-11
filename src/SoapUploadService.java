import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SoapUploadService {

    @WebMethod
    public String uploadSignature(byte[] signatureData) {
        // Simulate processing signature upload
        System.out.println("Received signature data of length: " + (signatureData != null ? signatureData.length : 0));
        return "Signature uploaded successfully";
    }
}

