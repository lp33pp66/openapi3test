import java.net.URL

import com.fasterxml.jackson.databind.JsonNode
import org.openapi4j.core.validation.{ValidationException, ValidationResults}
import org.openapi4j.operation.validator.validation.RequestValidator
import org.openapi4j.parser.OpenApi3Parser
import org.openapi4j.parser.validation.v3.OpenApi3Validator
import org.openapi4j.schema.validator.v3.SchemaValidator

object OpenApiTest {
  def main(args: Array[String]): Unit = {
    //  val specPath = new File("../../../../main/scala/api/api.yml")
    val specPath = new URL("https://raw.githubusercontent.com/OAI/OpenAPI-Specification/master/examples/v3.0/petstore-expanded.yaml")
    val api = new OpenApi3Parser().parse(specPath, true)
    val results: ValidationResults = OpenApi3Validator.instance.validate(api)

    println("*******"+results.getItems)

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
