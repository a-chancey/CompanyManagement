<%@ page import="companymanagement.Company" %>



<div class="fieldcontain ${hasErrors(bean: companyInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="company.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${companyInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: companyInstance, field: 'phone', 'error')} required">
	<label for="phone">
		<g:message code="company.phone.label" default="Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phone" required="" value="${companyInstance?.phone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: companyInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="company.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${companyInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: companyInstance, field: 'employees', 'error')} ">
	<label for="employees">
		<g:message code="company.employees.label" default="Employees" />
		
	</label>
	<g:select id="employees" name="employees.id" from="${companymanagement.Employee.list()}" optionKey="id" value="${companyInstance?.employees?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

