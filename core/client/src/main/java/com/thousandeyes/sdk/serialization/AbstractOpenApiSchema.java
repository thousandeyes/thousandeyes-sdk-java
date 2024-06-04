package com.thousandeyes.sdk.serialization;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * Abstract class for oneOf,anyOf schemas defined in OpenAPI spec
 */
@ToString
@EqualsAndHashCode
public abstract class AbstractOpenApiSchema {

    // store the actual instance of the schema/object
    @Getter
    @Setter
    private Object actualInstance;

    @Getter
    private final Boolean isNullable;

    // schema type (e.g. oneOf, anyOf)
    @Getter
    private final String schemaType;

    public AbstractOpenApiSchema(String schemaType, Boolean isNullable) {
        this.schemaType = schemaType;
        this.isNullable = isNullable;
    }

    /**
     * Get the list of oneOf/anyOf composed schemas allowed to be stored in this object
     *
     * @return an instance of the actual schema/object
     */
    public abstract Map<String, Class<?>> getSchemas();

    /**
     * Get the instant recursively when the schemas defined in oneOf/anyof happen to be oneOf/anyOf schema as well
     *
     * @return an instance of the actual schema/object
     */
    public Object getActualInstanceRecursively() {
        return getActualInstanceRecursively(this);
    }

    private Object getActualInstanceRecursively(AbstractOpenApiSchema object) {
        if (object.getActualInstance() == null) {
            return null;
        }
        else if (object.getActualInstance() instanceof AbstractOpenApiSchema) {
            return getActualInstanceRecursively((AbstractOpenApiSchema) object.getActualInstance());
        }
        else {
            return object.getActualInstance();
        }
    }
}
