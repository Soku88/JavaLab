package com.koreait.apart;


import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.koreait.apart.model.ApartmentInfoDTO;
import com.koreait.apart.model.ApartmentInfoDomain;
import com.koreait.apart.model.ApartmentInfoEntity;
import com.koreait.apart.model.LocationEntity;
import com.koreait.apart.model.ResponseDomain;

@Service
public class HomeService {
	
	@Autowired
	private HomeMapper mapper;
	
	public List<LocationEntity> selLocation() {
		return mapper.selLocation();
	}
	
	public List<ApartmentInfoDomain> getData(ApartmentInfoEntity p) {
		
		Map<String, Integer> map = new HashMap();
		map.put("27110", 1);
		map.put("27140", 2);
		map.put("27170", 3);
		map.put("27200", 4);
		map.put("27230", 5);
		map.put("27260", 6);
		map.put("27290", 7);
		map.put("27710", 8);

		
		
		String url = "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";
		String decodeServiceKey = "Y2UOCkD8Ilv2gViPGV33ddNTTQfRi92i8mRzUeQX+NgSiNTO3gp9hJZX4J6u8uXucMM6RdRBoGxMn6XHfsEzNA==";
		
		
		String mon = "0" + p.getDeal_month();
		mon = mon.substring(mon.length()-2);
		final String deal_ym = p.getDeal_year() + mon;
		
		final String lawd_cd = p.getRegional_code();
		
		final int location_cd = map.get(lawd_cd);
		p.setLocation_cd(location_cd);
		
		
		List<ApartmentInfoDomain> dbList = mapper.selApart(p);
		if(dbList.size() > 0) {
			return dbList;
		}
		
		final HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		
		final HttpEntity entity = new HttpEntity(headers);
		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
								.queryParam("LAWD_CD", lawd_cd)
								.queryParam("DEAL_YMD", deal_ym)
								.queryParam("serviceKey", decodeServiceKey)
								.build(false);
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters()
		.add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		
		ResponseEntity respEntity = 
				restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
		
		String result = (String)respEntity.getBody();
		
		ObjectMapper om = new XmlMapper()
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ResponseDomain domain = null;
		
		try {
			domain = om.readValue(result, ResponseDomain.class);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		List<ApartmentInfoEntity> list = domain.getBody().getItems();
		if(list != null && list.size() > 0) {
			mapper.insApart(new ApartmentInfoDTO(location_cd, list));	
		}
		
		return mapper.selApart(p);
	
	}
	
}
