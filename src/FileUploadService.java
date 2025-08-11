import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;

@Path("/upload")
public class FileUploadService {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadFile(@FormDataParam("file") InputStream fileInputStream,
                               @FormDataParam("file") FormDataContentDisposition fileMetaData) {
        // Simulate file upload processing
        System.out.println("Received file: " + (fileMetaData != null ? fileMetaData.getFileName() : "No file name"));
        return Response.status(200).entity("File uploaded successfully").build();
    }
}
