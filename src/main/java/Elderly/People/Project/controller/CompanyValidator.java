package Elderly.People.Project.controller;

import Elderly.People.Project.model.Company;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CompanyValidator implements Validator {
    @Override
    public boolean supports(Class<?> cls) {
        return Company.class.equals(cls);

    }
    @Override
    public static void validate(Object obj, Errors errors) {
        Company company = (Company)obj;
        if (company.getCIF().trim().equals(""))
            errors.rejectValue("CIF", "obligatorio");
        if (company.getName().trim().equals(""))
            errors.rejectValue("Nombre", "obligatorio");
        if (company.getAddress().trim().equals(""))
            errors.rejectValue("dirección", "obligatorio");
        if (company.getCPName().trim().equals(""))
            errors.rejectValue("Nombre", "obligatorio");
        if (company.getCPPersonEmail().trim().equals(""))
            errors.rejectValue("Correo", "obligatorio",
                    "Introduzca correo");
        if (company.getCPPhoneNumber().trim().equals(""))
            errors.rejectValue("Numero de telefono", "obligatorio",
                    "Introduzca uhn numero");


    }
}
