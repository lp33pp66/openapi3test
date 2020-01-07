import java.net.URL

import akka.event.Logging.LogEvent
import com.fasterxml.jackson.databind.JsonNode
import org.openapi4j.core.validation.{ValidationException, ValidationResults}
import org.openapi4j.operation.validator.validation.RequestValidator
import org.openapi4j.parser.OpenApi3Parser
import org.openapi4j.parser.validation.v3.OpenApi3Validator
import org.openapi4j.schema.validator.v3.SchemaValidator

object OpenApiTest {
  def main(args: Array[String]): Unit = {
    //  val specPath = new File("../../../../main/scala/api/api.yml")
    val specPath = new URL("https://raw.githubusercontent.com/lp33pp66/openapi3test/master/src/main/scala/api.yml")
    val api = new OpenApi3Parser().parse(specPath, false)
    val results = OpenApi3Validator.instance.validate(api)


    println(api.getPaths)
    println("123: " + results.toString)

    //    // validation with exception
    //    val schemaNode: JsonNode = ??? // your schema tree node
    //    val contentNode: JsonNode = ??? // your data
    //    val schemaValidator: SchemaValidator = new SchemaValidator("my_schema", schemaNode)
    //    try {
    //      schemaValidator.validate(contentNode)
    //    } catch {
    //      case ex: ValidationException => ex.getResults
    //    }
    //
    //    //validation without ex
    //    val results1 = new ValidationResults
    //    schemaValidator.validate(contentNode, results1)
    //    if (!results1.isValid) {
    //      results1
    //    }
    //
    //
    //    val v = new RequestValidator(api)
  }

}
