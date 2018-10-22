/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 22 18:50:15 GMT 2018
 */

package org.telegram.abilitybots.api.sender;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.telegram.abilitybots.api.sender.DefaultSender;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.send.SendVideoNote;
import org.telegram.telegrambots.meta.api.methods.send.SendVoice;
import org.telegram.telegrambots.meta.api.methods.stickers.AddStickerToSet;
import org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet;
import org.telegram.telegrambots.meta.api.methods.stickers.UploadStickerFile;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.WebhookInfo;
import org.telegram.telegrambots.meta.updateshandlers.DownloadFileCallback;
import org.telegram.telegrambots.meta.updateshandlers.SentCallback;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultSender_ESTest extends DefaultSender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SentCallback<WebhookInfo> sentCallback0 = (SentCallback<WebhookInfo>) mock(SentCallback.class, new ViolatedAssumptionAnswer());
      defaultSender0.getWebhookInfoAsync(sentCallback0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SentCallback<User> sentCallback0 = (SentCallback<User>) mock(SentCallback.class, new ViolatedAssumptionAnswer());
      defaultSender0.getMeAsync(sentCallback0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      BotApiMethod<Integer> botApiMethod0 = (BotApiMethod<Integer>) mock(BotApiMethod.class, new ViolatedAssumptionAnswer());
      SentCallback<Integer> sentCallback0 = (SentCallback<Integer>) mock(SentCallback.class, new ViolatedAssumptionAnswer());
      defaultSender0.executeAsync(botApiMethod0, sentCallback0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      DownloadFileCallback<String> downloadFileCallback0 = (DownloadFileCallback<String>) mock(DownloadFileCallback.class, new ViolatedAssumptionAnswer());
      defaultSender0.downloadFileAsync("", downloadFileCallback0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.stickers.UploadStickerFile.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      UploadStickerFile uploadStickerFile0 = mock(UploadStickerFile.class, new ViolatedAssumptionAnswer());
      File file0 = defaultSender0.uploadStickerFile(uploadStickerFile0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).toString();
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.stickers.UploadStickerFile.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      UploadStickerFile uploadStickerFile0 = mock(UploadStickerFile.class, new ViolatedAssumptionAnswer());
      File file1 = defaultSender0.uploadStickerFile(uploadStickerFile0);
      assertEquals(0, (int)file1.getFileSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Message) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.send.SendVoice.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SendVoice sendVoice0 = mock(SendVoice.class, new ViolatedAssumptionAnswer());
      Message message0 = defaultSender0.sendVoice(sendVoice0);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Message) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.send.SendVideo.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SendVideo sendVideo0 = mock(SendVideo.class, new ViolatedAssumptionAnswer());
      Message message0 = defaultSender0.sendVideo(sendVideo0);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Message) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.send.SendSticker.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SendSticker sendSticker0 = mock(SendSticker.class, new ViolatedAssumptionAnswer());
      Message message0 = defaultSender0.sendSticker(sendSticker0);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Message) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.send.SendPhoto.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SendPhoto sendPhoto0 = mock(SendPhoto.class, new ViolatedAssumptionAnswer());
      Message message0 = defaultSender0.sendPhoto(sendPhoto0);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Message) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.send.SendDocument.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      Message message0 = defaultSender0.sendDocument((SendDocument) null);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Message) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.send.SendAudio.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SendAudio sendAudio0 = mock(SendAudio.class, new ViolatedAssumptionAnswer());
      Message message0 = defaultSender0.sendAudio(sendAudio0);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((WebhookInfo) null).when(defaultAbsSender0).getWebhookInfo();
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      WebhookInfo webhookInfo0 = defaultSender0.getWebhookInfo();
      assertNull(webhookInfo0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((User) null).when(defaultAbsSender0).getMe();
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      User user0 = defaultSender0.getMe();
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable) null).when(defaultAbsSender0).execute(nullable(java.lang.Object.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      BotApiMethod<String> botApiMethod0 = (BotApiMethod<String>) mock(BotApiMethod.class, new ViolatedAssumptionAnswer());
      String string0 = defaultSender0.execute(botApiMethod0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn("org.telegram.abilitybots.api.sender.DefaultSender").when(defaultAbsSender0).execute(nullable(java.lang.Object.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      BotApiMethod<String> botApiMethod0 = (BotApiMethod<String>) mock(BotApiMethod.class, new ViolatedAssumptionAnswer());
      String string0 = defaultSender0.execute(botApiMethod0);
      assertEquals("org.telegram.abilitybots.api.sender.DefaultSender", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((java.io.File) null).when(defaultAbsSender0).downloadFile(any(org.telegram.telegrambots.meta.api.objects.File.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      java.io.File file0 = defaultSender0.downloadFile((File) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((java.io.File) null).when(defaultAbsSender0).downloadFile(anyString());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      java.io.File file0 = defaultSender0.downloadFile((String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Boolean) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      CreateNewStickerSet createNewStickerSet0 = mock(CreateNewStickerSet.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = defaultSender0.createNewStickerSet(createNewStickerSet0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Boolean) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.stickers.AddStickerToSet.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      AddStickerToSet addStickerToSet0 = mock(AddStickerToSet.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = defaultSender0.addStickerToSet(addStickerToSet0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      // Undeclared exception!
      try { 
        defaultSender0.setChatPhoto((SetChatPhoto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SentCallback<WebhookInfo> sentCallback0 = (SentCallback<WebhookInfo>) mock(SentCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.getWebhookInfoAsync(sentCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.downloadFile(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SendSticker sendSticker0 = mock(SendSticker.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.sendSticker(sendSticker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      CreateNewStickerSet createNewStickerSet0 = mock(CreateNewStickerSet.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.createNewStickerSet(createNewStickerSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      // Undeclared exception!
      try { 
        defaultSender0.getWebhookInfo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      DownloadFileCallback<File> downloadFileCallback0 = (DownloadFileCallback<File>) mock(DownloadFileCallback.class, new ViolatedAssumptionAnswer());
      defaultSender0.downloadFileAsync((File) null, downloadFileCallback0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      // Undeclared exception!
      try { 
        defaultSender0.sendVoice((SendVoice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      GetFile getFile0 = mock(GetFile.class, new ViolatedAssumptionAnswer());
      SentCallback<File> sentCallback0 = (SentCallback<File>) mock(SentCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.executeAsync(getFile0, sentCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SendVideoNote sendVideoNote0 = mock(SendVideoNote.class, new ViolatedAssumptionAnswer());
      Message message0 = defaultSender0.sendVideoNote(sendVideoNote0);
      assertNull(message0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SendPhoto sendPhoto0 = mock(SendPhoto.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.sendPhoto(sendPhoto0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      // Undeclared exception!
      try { 
        defaultSender0.getMe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultAbsSender defaultAbsSender0 = mock(DefaultAbsSender.class, new ViolatedAssumptionAnswer());
      doReturn((Boolean) null).when(defaultAbsSender0).execute(any(org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto.class));
      DefaultSender defaultSender0 = new DefaultSender(defaultAbsSender0);
      SetChatPhoto setChatPhoto0 = mock(SetChatPhoto.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = defaultSender0.setChatPhoto(setChatPhoto0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      DownloadFileCallback<String> downloadFileCallback0 = (DownloadFileCallback<String>) mock(DownloadFileCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.downloadFileAsync("", downloadFileCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SendDocument sendDocument0 = mock(SendDocument.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.sendDocument(sendDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SendAudio sendAudio0 = mock(SendAudio.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.sendAudio(sendAudio0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SentCallback<User> sentCallback0 = (SentCallback<User>) mock(SentCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.getMeAsync(sentCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      // Undeclared exception!
      try { 
        defaultSender0.downloadFile("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      BotApiMethod<Integer> botApiMethod0 = (BotApiMethod<Integer>) mock(BotApiMethod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.execute(botApiMethod0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      AddStickerToSet addStickerToSet0 = mock(AddStickerToSet.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.addStickerToSet(addStickerToSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      SendVideo sendVideo0 = mock(SendVideo.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.sendVideo(sendVideo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultSender defaultSender0 = new DefaultSender((DefaultAbsSender) null);
      UploadStickerFile uploadStickerFile0 = mock(UploadStickerFile.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSender0.uploadStickerFile(uploadStickerFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.abilitybots.api.sender.DefaultSender", e);
      }
  }
}
