package cn.edu.hdu.zmj.TransFtlToWordDoc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * 
 * @author zero
 * @Date 2015年9月23日
 */
public class Main {

	private static String ftlTemplatePath = Thread.currentThread().getContextClassLoader().getResource("ftl/").getPath();
	
	private static String wordPath = Thread.currentThread().getContextClassLoader().getResource("word/").getPath();
	
	private static Configuration cfg = null;
	
	static {
		cfg = new Configuration();
		try {
			cfg.setDirectoryForTemplateLoading(new File(ftlTemplatePath));
			cfg.setObjectWrapper(new DefaultObjectWrapper());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		String templateFileName = "resume.ftl";
		String wordFileName = wordPath + "resume.doc";
		Map<String, Object> root = new HashMap<String, Object>();
		Resume resume = new Resume();
		initParam(resume);
		
		root.put("resume", resume);
		try {
			createWordDoc(templateFileName, wordFileName, root);
		} catch (TemplateNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedTemplateNameException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
//		System.out.println(ftlTemplatePath);
	}
	
	/**
	 * 写入word文件
	 * @param templateFileName	ftl模版name 不带路径
	 * @param wordFileName		生成的word文件 带路径
	 * @param root				数据map集合
	 * @throws TemplateNotFoundException
	 * @throws MalformedTemplateNameException
	 * @throws ParseException
	 * @throws IOException
	 * @throws TemplateException
	 */
	@SuppressWarnings("unused")
	private static void createWordDoc(
				String templateFileName, String wordFileName, 
				Map<String, Object> root) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		Template template = cfg.getTemplate(templateFileName);
		
		FileOutputStream fos = new FileOutputStream(wordFileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		Writer out = new OutputStreamWriter(bos);
		template.process(root, out);
		
		out.flush();
		out.close();
		bos.close();
	}
	
	/**
	 * 初始化数据
	 * @param resume
	 */
	private static void initParam(Resume resume) {
		resume.setAddress("hangzhou");
		resume.setAge(20);
		resume.setSex("男");
		resume.setEducation("undergraduate course");
		resume.setEmail("zmj_hdu@outlook.com");
		resume.setHealthy("healthy");
		resume.setJobIntention("java");
		resume.setName("xxx");
		resume.setNation("han");
		resume.setOrigin("tx");
		resume.setPhone("1xxxxxxxxxx");
		resume.setSkill("null");
		resume.setWorkEx("null");
	}
}
