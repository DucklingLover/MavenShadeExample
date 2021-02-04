# Small tutorial for the Maven Shade Plugin

Goal: Create an executable .jar file that includes dependencies and resources.

# Steps
* Create a resource folder that holds all non-java related files.
  In most cases this folder will be created in the directory *src/main/resources*
* Set your resource location in your pom file using the *resource* tag.
  Note that you have to retrieve your resource file with the *getResourceAsStream()*-Method. Getting your resource as an URL won't work.
* Set the fully qualified path to your main class in the *mainClass* tag.
* Build your project
* In your target folder you will find two jar files. The -shaded.jar archive will include all resources and dependencies so make sure to distribute the shaded jar file.
* Optional: 
    - Add dependencies to the pom using the *dependency* tag.

For more features and a detailed explanation please take a look at the offical documentation: https://maven.apache.org/plugins/maven-shade-plugin/

# Part of the pom.xml as a reference
```xml
[...]
<build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
            </resource>
        </resources>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>3.2.4</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <shadedArtifactAttached>true</shadedArtifactAttached>
                            <transformers>
                                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                    <mainClass>fully.qualified.MainClass</mainClass>
                                </transformer>
                            </transformers>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
[...]
```
