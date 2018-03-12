package ${SERVICE_IMPL_PACKAGE};

import ${MAPPER_PACKAGE}.${modelNameUpperCamel}Mapper;
import ${MODEL_PACKAGE}.${modelNameUpperCamel};
import ${SERVICE_PACKAGE}.${modelNameUpperCamel}Service;
import ${BASE_PACKAGE}.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by ${author} on ${date}.
 */
@Service
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {

    @Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
