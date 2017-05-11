import com.hp.hpl.jena.rdf.model.*;
import java.io.FileOutputStream;

Model model = ModelFactory.createDefaultModel();
Resource programmers =
   model.createResource("http://example.org/wcjava/uri/programmers");
Property enjoy =
   model.createProperty("http://example.org/wcjava/uri/enjoy");
Resource java =
   model.createResource("http://example.org/wcjava/uri/java");
model.add(programmers, enjoy, java);
FileOutputStream outStream = new FileOutputStream("out.n3");
model.write(outStream, "N3");
outStream.close();
Property typeOf =
   model.createProperty("http://example.org/wcjava/typeOf");
Property use =
   model.createProperty("http://example.org/wcjava/use");
Property understand =
   model.createProperty("http://example.org/wcjava/understand");
Resource computers =
   model.createResource("http://example.org/wcjava/computers");
Resource progLang =
   model.createResource("http://example.org/wcjava/progLang");
model.add(java, typeOf, progLang);
model.add(programmers, use, computers);
model.add(computers, understand, progLang);
model.write(new java.io.FileOutputStream("out2.n3"), "N3"); 
