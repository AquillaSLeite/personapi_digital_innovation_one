package com.aquilla.peopleapi.dto.request;

import com.aquilla.peopleapi.enums.PhoneTypeEnum;
import com.aquilla.peopleapi.model.Person;
import com.aquilla.peopleapi.model.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class PhoneRequestDto {

    @NotNull
    private Long person;
    @NotNull
    @Enumerated(EnumType.STRING)
    private PhoneTypeEnum type;
    @NotNull
    private Integer ddd;
    @NotNull
    private Integer number;

    public Phone toResource(Person person) {
        return new Phone(null, person, this.type, this.ddd, this.number);
    }
}
